import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Cinema> Art = new ArrayList<>();
        Art.add(new address("Кирова 65"));
        Art.add(new address("Мира 8"));
        Art.add(new records("16:30"));
        Art.add(new records("18:50"));
        Art.add(new film("Терминатор"));
        Art.add(new film("Сумерки"));
        print(Art);
    }
    public static void print(ArrayList<Cinema> city) {
        System.out.println("Кино:");
        for (Cinema object: city) {
            System.out.println(object.toString());
        }
    }
}
class Cinema {
    String name;
    String info = "";
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    @Override
    public String toString() {
        return "CityObject{" +
                "name='" + name + '\'' +
                '}';
    }
    public void printInfo() {
        System.out.println(info);
    }
    public Cinema(String name) {
        this.name = name;
    }
}
class address extends Cinema {
    public address(String name) {
        super(name);
    }
    public address(String name, String info) {
        super(name);
        this.info = info;
    }
    @Override
    public String toString() {
        if (info.isEmpty()) {
            return "Адрес - " + name;
        } else {
            return "Адрес - " + name + " - " + info;
        }
    }
}
class film extends Cinema {
    public film(String name) {
        super(name);
    }
    public film(String name, String info) {
        super(name);
        this.info = info;
    }
    @Override
    public String toString() {
        if (info.isEmpty()) {
            return "Фильм - " + name;
        } else {
            return "Фильм - " + name + " - " + info;
        }
    }
}
class records extends Cinema {
    public records(String name) {
        super(name);
    }
    public records(String name, String info) {
        super(name);
        this.info = info;
    }
    @Override
    public String toString() {
        if (info.isEmpty()) {
            return "Время сеанса - " + name;
        } else {
            return "Время сеанса - " + name + " - " + info;
        }
    }
}