package cn.lcp.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lcp.bean.Blog;
import cn.lcp.dao.EssayDao;
import cn.lcp.service.EssayService;

@Service("essayService")
@Transactional(readOnly = false)
public class EssayServiceImpl implements EssayService {
	@Resource(name = "essayDao")
	private EssayDao essayDao;
	
	public EssayDao getEssayDao() {
		return essayDao;
	}

	public void setEssayDao(EssayDao essayDao) {
		this.essayDao = essayDao;
	}

	//д�����
	@Override
	public void writeEssay(Blog blog) {
		this.essayDao.writeEssay(blog);
	}
}