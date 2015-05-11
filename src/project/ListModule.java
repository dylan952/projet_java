package project;

import java.util.ArrayList;

public class ListModule {
    ArrayList listModule = new ArrayList<Module>();
    
    public void addModule(Module m){
        listModule.add(m);
    }
    
    public Module getModule(int index){
        return (Module)listModule.get(index);
    }
    
    public Module getModule(String nomModule){
        for (int i = 0; i < listModule.size(); i++) {
            if(getModule(i).nom == nomModule)
                return getModule(i);
        }
        return null;
    }
    
    public String[] getAllModules(){
        String[] modules = new String[listModule.size()];
        System.out.println(listModule);
        
        for (int i = 0; i < listModule.size(); i++) {
            modules[i] = getModule(i).nom;
        }
        
        return modules;
    }
    
}