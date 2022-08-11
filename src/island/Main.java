package island;

import island.ui.Editor;

public class Main {

    // запуск редактора настроек или эмуляции острова
    public static void main(String[] args) {
	    if(args.length>0 && "edit".equalsIgnoreCase(args[0])){
	        new Editor().editor();
        } else {
	        new Island().start();
        }
    }
}
