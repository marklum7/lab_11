public class Buy implements product, user {
    private String title;
    private double price;
    private double rating;
    private String login;
    private String password;

    public Buy(String title, double price, double rating,String login, String password) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.login = login;
        this.password = password;
    }
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getRating() {
        return rating;
    }

    @Override
    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    public void buy(){
        System.out.println(login + " купил " + title+" за "+price+". Рейтинг товара"+rating+", пароль от профиля "+password);
    }
}
