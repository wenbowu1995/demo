import generate.TCustomer;
import generate.TCustomerDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dolombok {
    @Mapper
    static
    TCustomerDao tCustomerDao;
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        TCustomer record = new TCustomer();
        tCustomerDao.insert(record);
    }
}
