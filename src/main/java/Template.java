public enum Template {


    BASE_TEMPLATE("abc"),

    POST_TEMPLATE(""),

    GET_TEMPLATE(""),

    TESTNGXML_TEMPLATE("");
    private String templateString;
    TEMPLATE(String templateString) {
        this.templateString=templateString;

    }

    public String toString(){
        return templateString;
    }
}
