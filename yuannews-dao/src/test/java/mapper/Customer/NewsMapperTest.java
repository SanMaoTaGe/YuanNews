package mapper.Customer;

import org.junit.Test;
import yuan.ssm.common.util.LoggerUtil;
import yuan.ssm.pojo.NewsCustom;

import java.util.List;

/**
 * ==================================================
 * <p/>
 * 版权：　软件工程.net12-1 原明卓
 * <p/>
 * 项目：　基于用户兴趣标签的新闻推荐系统
 * <p/>
 * 作者：　原明卓
 * <p/>
 * 版本：　1.0
 * <p/>
 * 创建日期：　16-4-25 下午4:53
 * <p/>
 * 功能描述： TODO
 * <p>
 * <p/>
 * 功能更新历史：
 * <p>
 * ==================================================
 */
public class NewsMapperTest extends CustomerBaseTest{

    @Override
    public void setUp() {
        super.setUp();
    }

    @Test
    public void findNewsCustomTest() throws Exception {
        List<NewsCustom> newsCustom = newsMapper.findNewsCustom(0, 10);
        LoggerUtil.printJSON(newsCustom);
    }

}
