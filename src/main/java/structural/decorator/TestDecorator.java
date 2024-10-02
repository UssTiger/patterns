package structural.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        String salaryRecords = "Приветственное сообщение";
        DataSourceDecorator encoded = new EncryptionDataSourceDecorator(
                new LoggingProcessDataSourceDecorator(
                        new FileDataSource("src/main/resources/test_files/text.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("src/main/resources/test_files/text.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
