    package com.example.Beginnerproject;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.beans.factory.annotation.Qualifier;
    import org.springframework.context.annotation.Scope;
    import org.springframework.stereotype.Component;

    @Component //means create obj of class Alien in Spring Container
//    @Scope(value = "prototype") // to create multiple objs
    public class Alien {
    private int aid;
    private String aname;
    private String tech;
    @Autowired //means inject dependency: Alien class has dependency of Laptop - search by type
//    @Qualifier("lapi1") //search by name lapi1
    private Laptop laptop;

    public Alien(){
        super();
        System.out.println("object created");
    }
        public int getAid() {
            return aid;
        }

        public void setAid(int aid) {
            this.aid = aid;
        }

        public String getAname() {
            return aname;
        }

        public void setAname(String aname) {
            this.aname = aname;
        }

        public String getTech() {
            return tech;
        }

        public void setTech(String tech) {
            this.tech = tech;
        }

        public void show(){
        laptop.compile();
        System.out.println("in show..");
        }
    }