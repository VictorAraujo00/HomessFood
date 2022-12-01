package homessfood.negocio.entities;

public class Embalagem {
        // como temos uma lista só de cozinheiros colocaremos isso como singleton
        //isso garante que só vai ter uma lista de cozinheiros
        private static Embalagem uniqueInstance;
        //construtor privado só a classe acessa

        private Embalagem() {
            
        }
        public static synchronized Embalagem getInstance() {
            //se não tem vai ter um
            if (uniqueInstance == null)
                uniqueInstance = new Embalagem();
            // retorna sempre aquela unica instancia que foi criada
            return uniqueInstance;
        }
        public void tipoEmbalagem(){

        }
}
