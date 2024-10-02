package structural.decorator;

import java.util.Base64;

public class EncryptionDataSourceDecorator extends DataSourceDecorator {

    public EncryptionDataSourceDecorator(DataSource delegate) {
        super(delegate);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] bytes = Base64.getDecoder().decode(data);
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] -= (byte) 1;
        }
        var result = new String(bytes);
        return new String(result);
    }

}
