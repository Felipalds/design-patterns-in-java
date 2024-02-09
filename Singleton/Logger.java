class Logger {

    public static class Log {

        private Log(){} //we can't do a "new Log()" outside class Log

        private static Log instance;

        public static Log getInstance() {
            if(instance == null) instance = new Log();

            return instance;
        }

        public void print(String msg) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Log log = Log.getInstance();
        System.out.println(log);
        log.print("Hello world");

        Log log2 = Log.getInstance();
        System.out.println(log2);
        log2.print("Hello world 2");
    }
}