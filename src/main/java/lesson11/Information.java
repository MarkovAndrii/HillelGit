package lesson11;

import java.util.*;

public class Information {
    private List<String> userName;
    private Set<String> userMail;
    private Map<String, String> mailForUser;

    public List<String> getUserName() {
        return userName;
    }

    public void setUserName(List<String> userName) {
        this.userName = userName;
    }

    public Set<String> getUserMail() {
        return userMail;
    }

    public void setUserMail(Set<String> userMail) {
        this.userMail = userMail;
    }

    public Map<String, String> getMailForUser() {
        return mailForUser;
    }

    public void setMailForUser(Map<String, String> mailForUser) {
        this.mailForUser = mailForUser;
    }

    public Information(List<String> userName, Set<String> userMail, Map<String, String> mailForUser) {
        this.userName = new ArrayList<>(userName);
        this.userMail = new HashSet<>(userMail);
        this.mailForUser = new HashMap<>(mailForUser);
    }
}
