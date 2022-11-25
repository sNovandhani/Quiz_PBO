package quiz_pbo;

public class Login {
    private String id = "admin123";

    boolean cekUser(String id) {
        if (this.id.equals(id)) {
            return true;
        } else {
            return false;

        }

    }
}
