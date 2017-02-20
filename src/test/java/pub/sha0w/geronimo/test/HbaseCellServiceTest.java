package pub.sha0w.geronimo.test;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import pub.sha0w.geronimo.model.HbaseCell;
import pub.sha0w.geronimo.service.HbaseCellService;


/**
 * Created by coco1 on 2017/2/13.
 */
public class HbaseCellServiceTest {
    private final HbaseCellService hbaseCellService;
    private static final Logger logger = Logger.getLogger(HbaseCellServiceTest.class);
    public HbaseCellServiceTest() {

        hbaseCellService = new HbaseCellService();
    }

    @Before
    public void init() {
        //todo 初始化环境
    }
     @Test
    public void testCreateHbaseCell(HbaseCell hbaseCell) {
        if (!hbaseCellService.CreateHbaseCell(hbaseCell)) {
            logger.error("测试新建cell不通过");
        } else {
            logger.debug("测试新建cell成功");
        }
     }
    @Test
    public void testDeleteHbaseCell(HbaseCell hbaseCell) {
        if (!hbaseCellService.DeleteHbaseCell(hbaseCell)) {
            logger.error("测试新建cell不通过");
        } else {
            logger.debug("测试新建cell成功");
        }
    }

    @Test
    public void testGetHbaseCell(String rowKey) {
        if (hbaseCellService.getHbaseCell(rowKey) == null) {
            logger.error("测试获取cell不通过");
        } else {
            logger.debug("测试获取cell成功");
        }
    }


    @Test
    public void testGetHbaseCellList(String keyword) {
        if (hbaseCellService.getHbaseCellList(keyword) == null) {
            logger.error("测试获取list不通过");
        } else {
            logger.debug("测试获取list成功");
        }
    }


}
