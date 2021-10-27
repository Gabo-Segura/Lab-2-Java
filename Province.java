package labs.lab2;

public class Province {

    // --------------------------
    // --------------------------
    // instance variables
    // --------------------------
    // --------------------------
    private String[] provinces = {
            "Ontario",
            "Quebec",
            "British Columbia",
            "Alberta",
            "Manitoba",
            "Saskatchewan",
            "Nova Scotia",
            "New Brunswick",
            "Newfoundland and Labrador",
            "Prince Edward Island",
            "Northwest Territories",
            "Nunavut",
            "Yukon"
    };
    private String[] capitals = {
            "Toronto",
            "Quebec",
            "Victoria",
            "Edmonton",
            "Winnipeg",
            "Regina",
            "Halifax",
            "Fredericton",
            "St. John's",
            "Charlottetown",
            "Yellowknife",
            "Iqaluit",
            "Whitehorse"
    };

    private String DEFAULT_PROVINCE = "British Columbia";
    private String DEFAULT_CAPITAL = "Victoria";
    private long DEFAULT_POPULATION = 4_648_055;

    // Class labs.lab2.Province has three instance variables
    private String name;
    private String capital;
    private long population;


    // constructor
    public Province(String name, String capital, long population) {
        if (isValidPopulation(population) && (isValidProvince(name)
                && (isValidCapitalCity(capital)))) {

            this.name = name;
            this.capital = capital;
            this.population = population;
        } else {
            // if there is any error; create the default data, shown below
            this.population = DEFAULT_POPULATION;
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
        }
    }


    // --------------------------
    // --------------------------
    // methods
    // --------------------------
    // --------------------------

    // --------------------------
    // --------------------------
    // method PROVINCE
    public boolean isValidProvince(String province){
        for(String x : provinces){
            if (x.equals(province)){
                return true;
            }
        }
        return false;
    }

    // setter PROVINCE
    public void set_name(String name){
        if (isValidProvince(name)) {
            this.name = name;
        }
        else{
            this.name = DEFAULT_PROVINCE;
        }
    }

    // getter PROVINCE
    public String get_name(){
        return name;
    }

    // --------------------
    // --------------------
    // method CAPITAL CITY
    public boolean isValidCapitalCity(String capital){
        for(String x : capitals){
            if (x.equals(capital)){
                return true;
            }
        }
        return false;
    }

    // setter CAPITAL CITY
    public void set_capital(String capital){
        if (isValidCapitalCity(capital)){
            this.capital = capital;
        }
        else{
            this.capital = DEFAULT_CAPITAL;
        }
    }

    // getter CAPITAL CITY
    public String get_capital(){
        return capital;
    }


    // --------------------
    // --------------------
    // method population
    public boolean isValidPopulation(long population) {
        if (population > 30_000 && population < 15_000_000){
            return true;
        }
        return false;
    }

    // setter POPULATION
    public void set_population(long population){
        if (isValidPopulation(population)){
            this.population = population;
        }
        else {
            this.population = DEFAULT_POPULATION;
        }
    }

    // getter POPULATION
    public long get_population() { return population; }



    // returns a String in the format:
    // The capital of British Columbia (population. 4648055) is Victoria.

    public String getDetails() {
        String details = String.format(
            "The capital of " + get_name() +
            " (population. " + get_population() + ")" +
            " is " + get_capital() + ".");

        return details;
    }

}