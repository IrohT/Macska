package hu.szte.Macska;

public class Macskafele{


        String nev;


        public String toString() {
                return "Macska{" +
                        "nev='" + nev + '\'' +
                        '}';
        }



        public Macskafele(String nev) {
                this.nev = nev;
        }


        public void nyavog(){
                System.out.println("?????");
        }


}

