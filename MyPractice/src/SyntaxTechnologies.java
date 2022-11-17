public class SyntaxTechnologies {

        String schoolName;
        int batch;
        int year;
        String lastDayOfClass;
        SyntaxTechnologies() {

        }
            public SyntaxTechnologies(String schoolName,int batch,int year,String lastDayOfClass) {
                this.schoolName=schoolName;
                this.batch=batch;
                this.year=year;
                this.lastDayOfClass=lastDayOfClass;
            }
            void display() {
                System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
            }
        }
class Main {
    public static void main(String[] args) {
        SyntaxTechnologies objj = new SyntaxTechnologies();
        SyntaxTechnologies obj = new SyntaxTechnologies("Syntax", 6, 2020, "07/30/2020");
        obj.display();
        objj.display();
    }
}

