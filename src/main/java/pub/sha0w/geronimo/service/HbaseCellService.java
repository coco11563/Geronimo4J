package pub.sha0w.geronimo.service;

import org.apache.log4j.Logger;
import pub.sha0w.geronimo.model.HbaseCell;
import pub.sha0w.geronimo.util.PropsUtil;

import java.util.List;
import java.util.Properties;

/**
 * Created by coco1 on 2017/2/13.
 */
public class HbaseCellService {
    private static final Logger LOGGER = Logger.getLogger(HbaseCellService.class);

    public List<HbaseCell> getHbaseCellList(String keywords) {
        //TODO
        return null;
    }
    public HbaseCell getHbaseCell(String rowkey) {
        //TODO
        return null;
    }
    public boolean CreateHbaseCell(HbaseCell hbaseCell) {
        //todo
        return false;
    }
    public boolean DeleteHbaseCell(HbaseCell hbaseCell) {
        //todo
        return false;
    }
}
