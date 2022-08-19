public class LanguagePrograms {

    private String Language;
    private String Type;

    public LanguagePrograms(String language, String type) {
        Language = language;
        Type = type;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "LanguagePrograms{" + "Language='" + Language + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
