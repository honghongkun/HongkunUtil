package com.Hong.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Hong.ssm.bean.BasGrade;
import com.Hong.ssm.bean.BasOrg;
import com.Hong.ssm.bean.BasStu;
import com.Hong.ssm.bean.BasStuExt;
import com.Hong.ssm.bean.StuZy;
import com.Hong.ssm.bean.SysMenu;
import com.Hong.ssm.bean.SysUser;
import com.Hong.ssm.service.BasGradeService;
import com.Hong.ssm.service.BasOrgService;
import com.Hong.ssm.service.BasStuService;
import com.Hong.ssm.service.UserService;
import com.Hong.ssm.utils.ConstantUtil;
import com.Hong.ssm.utils.PageModel;

@Controller
@RequestMapping(value="/admin/student")
public class BasStuController {

	@Autowired
	private BasStuService basStuServiceImpl;
	
	@Autowired
	private BasOrgService basOrgServiceImpl;
	
	@Autowired
	private BasGradeService basGradeServiceImpl;
	@Autowired
	private UserService userServiceImpl;
	
	/*@RequestMapping(value="/selBasStulist",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selBasStulist(BasStu basStu,Integer pageNo,Integer pageSize){
		Map<String, Object> map=new HashMap<String, Object>();
		PageModel<BasStu> list = basStuServiceImpl.selBasStulist(basStu, pageNo, pageSize);
		map.put("succ", true);
		map.put("msg", "��ȡ���ݳɹ�");
		map.put("data", list);
		 return map;
	}*/
	/**
	 * ������֯�ṹ��ѯ���
	 * @param basStu
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value="/selBasStuOrBasOrglist",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> selBasStuOrBasOrglist(BasStu basStu,Integer pageNo,Integer pageSize){
		Map<String, Object> map=ConstantUtil.map;
		PageModel<BasStuExt> list = basStuServiceImpl.selBasStuOrBasOrglist(basStu, pageNo, pageSize);
		map.put("succ", true);
		map.put("msg", "��ȡ���ݳɹ�");
		map.put("data", list);
		 return map;
		
	}
	/**
	 * ���
	 * @param basStu
	 * @return
	 */
	@RequestMapping(value="/selBasStuselect",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> selBasStuselect(BasStu basStu){
		Map<String, Object> map=ConstantUtil.map;
		List<BasStuExt> list= basStuServiceImpl.selBasStuselect(basStu);
		map.put("succ", true);
		map.put("msg", "��ȡ���ݳɹ�");
		map.put("data", list);
		 return map;
		
	}
	
	@RequestMapping(value="/addBasStu",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> addBasStu(BasStu basStu){
		System.out.println("-------------------------------------------");
		Map<String, Object> map=ConstantUtil.map;
		Integer reInt= basStuServiceImpl.addBasStu(basStu);
		if (reInt>0) {
			map.put("succ", true);
			map.put("msg", "���ѧ���ɹ�");
		}else {
			map.put("msg", "���ѧ��ʧ�ܣ�������...");
		}
		 return map;
	}
	
	@RequestMapping(value="/editBasStu",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> editBasStu(BasStu basStu){
		Map<String, Object> map=ConstantUtil.map;
		boolean succ= basStuServiceImpl.editBasStu(basStu);
		if (succ) {
			map.put("succ", true);
			map.put("msg", "�޸ĳɹ�");
		}else {
			map.put("msg", "�޸�ʧ��,������...");
		}
		return map;
	}
	
	@RequestMapping(value="/selOrgcode",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> selOrgcode(BasOrg basOrg){
		Map<String, Object> map=new HashMap<String, Object>();
		List<BasOrg> list=basOrgServiceImpl.selOrgcode(basOrg);
		map.put("succ", true);
		map.put("msg", "��ȡ���ݳɹ�");
		map.put("data", list);
		 return map;	
	}
	/*Orgcode���Ϊ1*/
	@RequestMapping(value="/selOrgcode1",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> selOrgcode1(BasOrg basOrg){
		Map<String, Object> map=new HashMap<String, Object>();
		List<BasOrg> list=basOrgServiceImpl.selOrgcode1(basOrg);
		map.put("succ", true);
		map.put("msg", "��ȡ���ݳɹ�");
		map.put("data", list);
		 return map;	
	}
	/*Orgcode���Ϊ2*/
	@RequestMapping(value="/selOrgcode2",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> selOrgcode2(BasOrg basOrg){
		Map<String, Object> map=new HashMap<String, Object>();
		List<BasOrg> list=basOrgServiceImpl.selOrgcode2(basOrg);
		map.put("succ", true);
		map.put("msg", "��ȡ���ݳɹ�");
		map.put("data", list);
		 return map;	
	}
	
	@RequestMapping(value="/delBasStu",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> delBasStu(Integer stuId){
		Map<String, Object> map=ConstantUtil.map;
		boolean succ= basStuServiceImpl.delBasStu(stuId);
		if (succ) {
			map.put("succ", true);
			map.put("msg", "ɾ���ɹ�");
		}else {
			map.put("msg", "ɾ��ʧ��,������...");
		}
		return map;
	}
	
	/**
	 * ��ѯ������Ϣ��ýϵ��ѧ��
	 * @param basStu
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value="/selOrgcodelist",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> selOrgcodelist(BasStu basStu,Integer pageNo,Integer pageSize){
		Map<String, Object> map=ConstantUtil.map;
		PageModel<BasStuExt> list = basStuServiceImpl.selOrgcodelist(basStu, pageNo, pageSize);
		map.put("succ", true);
		map.put("msg", "��ȡ���ݳɹ�");
		map.put("data", list);
		 return map;
		
	}
	/**
	 * ��ѯ����ҽ��ѧԺ��ѧ��
	 * @param basStu
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value="/selOrgcodelist2",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> selOrgcodelist2(BasStu basStu,Integer pageNo,Integer pageSize){
		Map<String, Object> map=ConstantUtil.map;
		PageModel<BasStuExt> list = basStuServiceImpl.selOrgcodelist2(basStu, pageNo, pageSize);
		map.put("succ", true);
		map.put("msg", "��ȡ���ݳɹ�");
		map.put("data", list);
		 return map;
		
	}
	@RequestMapping(value="/selBasStuID",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> selBasStuID (Integer stuId){
		Map<String, Object> map=new HashMap<String, Object>();
		BasStu basStu= basStuServiceImpl.selBasStuID(stuId);
		map.put("succ", true);
		map.put("msg", "��ȡ���ݳɹ�");
		map.put("data", basStu);
		return map;
	}
	
/*------------------------------��ѯ�꼶Ϊ1------------------------------------------*/
	@RequestMapping(value="/selbasStuGradeBy1",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> selbasStuGradeBy1(BasGrade basGrade){
		Map<String, Object> map=ConstantUtil.map;
		List<BasGrade> list = basGradeServiceImpl.selbasStuGradeBy1(basGrade);
		map.put("succ", true);
		map.put("msg", "��ȡ���ݳɹ�");
		map.put("data", list);
		 return map;
		
	}
	/*------------------------------��ѯ�꼶Ϊ2------------------------------------------*/
	@RequestMapping(value="/selbasStuGradeBy2",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> selbasStuGradeBy2(BasGrade basGrade){
		Map<String, Object> map=ConstantUtil.map;
		List<BasGrade> list = basGradeServiceImpl.selbasStuGradeBy2(basGrade);
		map.put("succ", true);
		map.put("msg", "��ȡ���ݳɹ�");
		map.put("data", list);
		 return map;
		
	}
	//��ѯ�����꼶
		@RequestMapping(value="/selbasStuGrade",method= {RequestMethod.POST,RequestMethod.GET})
		@ResponseBody
		public Map<String, Object> selbasStuGrade(BasGrade basGrade){
			Map<String, Object> map=ConstantUtil.map;
			List<BasGrade> list = basGradeServiceImpl.selbasStuGrade(basGrade);
			map.put("succ", true);
			map.put("msg", "��ȡ���ݳɹ�");
			map.put("data", list);
			 return map;
			
		}
		@RequestMapping(value="/getmenu22",method=RequestMethod.POST)
		@ResponseBody
	    public Map<String, Object>  selUserMenu(HttpSession session){
			SysUser sysUser=(SysUser) session.getAttribute(ConstantUtil.SESSION_KEY);
	    	Map<String, Object> map=new HashMap<String, Object>();
	    	map.put("succ", false);
	    	map.put("msg", "�˵���ȡʧ��!");
	    	try {
	    		List<StuZy> menulist= userServiceImpl.selUserMenu22(sysUser.getUserRolepid());
	    		map.put("succ", true);
	    		map.put("msg", "��ȡ�˵��ɹ�");
	    		map.put("data", menulist);
			} catch (Exception e) {

	/*GetMessage �����������Ǵӵ�ǰ�̵߳���Ϣ�������ȡһ����Ϣ������ MSG �ṹ �С�*/
				map.put("msg", e.getMessage());
			}
			return map;
	    }
}
