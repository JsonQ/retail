import com.bigzone.RetailApplication;
import com.bigzone.service.CreditSystemService;
import com.bigzone.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.mockito.ArgumentMatchers.anyInt;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=RetailApplication.class)
@Transactional
public class ServiceTest {

    @Autowired
    private UserService userService;

    @MockBean
    private CreditSystemService csService;

    @Test
    public void testService(){
        int        userId = 10;
        int        ec = 100;
        BDDMockito.given(this.csService.getUserCredit(anyInt())).willReturn(ec);

        int credit = userService.getCredit(userId);
        Assert.assertEquals(ec, credit);

    }
}
