public class Status {

    public string Status {
        father("отец"); mother("мать"); husband("муж"); wife("жена"); brother("брат"), sister("сестра"); uncle("дядя"), aunt(тетя), grandfather("дедушка"), grandmother("бабушка");

        private final String status;
        
        Status(String status);

        public String getStatus(){
            return status;
        }

    }
    
}
