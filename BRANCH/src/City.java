class City{
    private int city_cod;
    private String city_name;

    public City(int city_cod,String city_name){
        this.city_cod = city_cod;
        this.city_name = city_name;
    }
    public int getCity_cod(){
        return city_cod;
    }
    public String getCity_name(){
        return city_name;
    }
}