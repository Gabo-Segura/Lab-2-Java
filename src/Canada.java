public class Canada {

    // instance
    private Province[] provinces;

    // constructor
    public Canada(){
        Province p1 = new Province("Ontario", "Toronto", 13_448_494);
        Province p2 = new Province("Quebec", "Quebec", 8_164_361);
        Province p3 = new Province("British Columbia", "Victoria", 4_648_055);
        Province p4 = new Province("Alberta", "Edmonton", 4_067_175);
        Province p5 = new Province("Manitoba", "Winnipeg", 1_278_365);
        Province p6 = new Province("Saskatchewan", "Regina", 1_098_352);
        Province p7 = new Province("Nova Scotia", "Halifax", 923_598);
        Province p8 = new Province("New Brunswick", "Fredericton", 747_101);
        Province p9 = new Province("Newfoundland and Labrador", "St. John's", 519_716);
        Province p10 = new Province("Prince Edward Island", "Charlottetown", 142_907);
        Province p11 = new Province("Northwest Territories", "Yellowknife", 41_786);
        Province p12 = new Province("Nunavut", "Iqaluit", 35_944);
        Province p13 = new Province("Yukon", "Whitehorse", 35_874);
        //Province[] provinces = {p1};
        this.provinces = new Province[]
                {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13}
        ;
    }

    // methods
    public void displayAllProvinces(){
        for (Province p : provinces){
            System.out.println(p.getDetails());
        }
    }

    public int getNumOfProvincesBetween(int min, int max){
        int num = 0;
        for (Province p : provinces) {
            if (p.get_population() / 1_000_000 >= min && p.get_population() / 1_000_000 <= max) {
                num++;
            }
        }
        return num;
    }

}
