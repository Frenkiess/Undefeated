package by.belhard.j24.homeworks.Home03;

public class Author {

    private String firName;
    private String secName;
    private int years;

    public Author(String firName, String secName, int years) {
        this.firName = firName;
        this.secName = secName;
        this.years = years;
    }

    public String getFirName() {
        return firName;
    }

    public void setFirName(String firName) {
        this.firName = firName;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firName='" + firName + '\'' +
                ", secName='" + secName + '\'' +
                ", years=" + years +
                '}';
    }
}
