package com.example.demo1.bean;

public class Login {
    private static final long serialVersionUID = 1L;

    /**
     * The user's name
     */
    private String name;

    /**
     * Get name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     *
     * @param name {@link String}
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Perform the login.
     *
     * This method is called when submitting the form in login.xhtml.
     */
    public String dispatch()
    {
        // A valid authentication is when name is "Jack"
        if (null != this.name && this.name.equals("Jack")) {
            return "welcome";
        } else {
            return "unknown";
        }
    }
}
