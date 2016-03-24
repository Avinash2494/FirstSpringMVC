package com.chipmonk.admissioncontroller;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class admissioncontroller {
	@RequestMapping(value="/admissionForm.html",method=RequestMethod.GET)
	public ModelAndView getAdmissionFrom(){
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
		
	}
	@RequestMapping(value="/submitadmissionForm.html",method=RequestMethod.POST)
	//public ModelAndView submitAdmissionFrom(@RequestParam(value = "studentname" , defaultValue ="Mr. xyz" ) String name ,@RequestParam("studenthobby") String studenthobbhy){
	/*public ModelAndView submitAdmissionFrom(@RequestParam Map<String,String> reqparams){
		String name = reqparams.get("studentname");
		String studenthobbhy = reqparams.get("studenthobby");
		*/
	public ModelAndView submitAdmissionFrom(@ModelAttribute("studentinfo") student student1,BindingResult result){
	    if(result.hasErrors()){
	    	ModelAndView model = new ModelAndView("AdmissionSucess");
	    	return model;
	    }
		ModelAndView model = new ModelAndView("AdmissionSucess");
		model.addObject("msg","Admission form submitted with name "+student1.getStudentname()+ " and hobby "+student1.getStudenthobby());
		
		return model;
		
	}

}
