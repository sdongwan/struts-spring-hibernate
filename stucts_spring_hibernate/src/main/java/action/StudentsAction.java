package action;

import bean.StudentsBean;
import com.opensymphony.xwork2.ActionSupport;
import service.StudentsService;

/**
 * Created by Administrator on 2017/6/6.
 */
public class StudentsAction extends ActionSupport {

    private StudentsService studentsService;

    public StudentsService getStudentsService() {
        return studentsService;
    }

    public void setStudentsService(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    public StudentsAction(){

        System.out.println("create");
    }


    @Override
    public String execute() throws Exception {


        StudentsBean studentsBean = new StudentsBean(1, "sdongwan", 18);
        studentsService.saveStudents(studentsBean);

        return SUCCESS;
    }
}
