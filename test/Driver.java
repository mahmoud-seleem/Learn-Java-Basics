public class Driver {
    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkPropertyAccess(String key) {
                if ("user.home".equals(key)) {
                    throw new SecurityException("Access to 'user.home' property is denied!");
                }
            }
        });
        
        System.out.println("SecurityManager set successfully.");

        // Attempt to access the restricted property
        try {
            String userHome = System.getProperty("user.home");
            System.out.println("User home directory: " + userHome);
        } catch (SecurityException e) {
            System.out.println("SecurityException: " + e.getMessage());
        }

        // Remove the SecurityManager
        System.setSecurityManager(null);
        System.out.println("SecurityManager removed.");

        // Try accessing the restricted property again
        try {
            String userHome = System.getProperty("user.home");
            System.out.println("User home directory after removal: " + userHome);
        } catch (SecurityException e) {
            System.out.println("SecurityException: " + e.getMessage());
        }
    }
}

        // Set a SecurityManager that restricts reading the "user.home" property

