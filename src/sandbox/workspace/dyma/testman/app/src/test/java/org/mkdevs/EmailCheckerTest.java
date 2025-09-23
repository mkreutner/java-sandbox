import org.mkdevs.EmailChecker;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
    
public class EmailCheckerTest {
    
    @org.junit.Test
    public void testValidEmails() {
        String[] validEmails = {
                "test@example.com",
                "user.name+tag+sorting@example.com",
                "user/name=tag@example.com",
                "user.name@subdomain.example.com",
                "user@localserver"
        };

        for (String email : validEmails) {
            assertTrue(EmailChecker.isValidEmail(email));
        }
    }

    // @org.junit.Test
    // public void testInvalidEmails() {
    //     String[] invalidEmails = {
    //             "plainaddress",
    //             "@missingusername.com",
    //             "username@.com",
    //             "user@domain..com",
    //             "user@domain.com.",
    //             null
    //     };

    //     for (String email : invalidEmails) {
    //         assertFalse(EmailChecker.isValidEmail(email));
    //     }
    // }
}
