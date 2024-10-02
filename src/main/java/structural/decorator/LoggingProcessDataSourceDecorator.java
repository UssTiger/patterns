package structural.decorator;

import java.util.logging.Logger;

public class LoggingProcessDataSourceDecorator extends DataSourceDecorator{

    private final Logger logger;

    public LoggingProcessDataSourceDecorator(DataSource wrappee) {
        super(wrappee);
        logger = Logger.getLogger("DataSourceDecorator");
    }

    @Override
    public void writeData(String data) {
        logger.info(String.format("Записываем данные [ %s ] в файл", data));
        super.writeData(data);
    }

    @Override
    public String readData() {
        logger.info(String.format("Читаем данные [ %s ] из файла", super.readData()));
        return super.readData();
    }

}
