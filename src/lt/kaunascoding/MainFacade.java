package lt.kaunascoding;

import lt.kaunascoding.crud.FileCRUD;

public class MainFacade {

    public static void main(String[] args) {
        FileCRUD model = new FileCRUD();
        model.createFile();
        model.updateFile();
        model.readFile();
    }
}
