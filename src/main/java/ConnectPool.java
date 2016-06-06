import java.util.Dictionary;
import main.java.Mysql;

public class ConnectPool {
    Dictionary<String, Mysql> mpool, spool;
    public ConnectPool(Dictionary<String, String> dbconf){

    }
    public Dictionary<Mysql, String> getServer{
        // todo
        return null;
    }

    public void disconnectAll(){
        for(i : mpool){
            mpool[i].close();
        }
        for(i : spool){
            spool[i].close();
        }
    }
}
