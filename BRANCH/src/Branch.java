 class Branch {
    private int branch_num;
    private String branch_name;
    private City main_city;
    public Branch(int branch_num,String branch_name,City main_city){
        this.branch_num = branch_num;
        this.branch_name = branch_name;
        this.main_city = main_city;
    }
    public void Disply(){
        System.out.println("Branch number is " +branch_num);
        System.out.println("Branch name is " +branch_name);
        System.out.println("City name is " +main_city.getCity_name()+"City code is " +main_city.getCity_cod());
    }
}
