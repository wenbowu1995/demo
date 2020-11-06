import generate.TCustomer;
import generate.TCustomerDao;
import org.apache.ibatis.annotations.Mapper;

public class Dolombok {
    @Mapper
    static
    TCustomerDao tCustomerDao;
    public static void main(String[] args) {
        TCustomer record = new TCustomer();
        tCustomerDao.insert(record);
    }
}
