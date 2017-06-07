package action;

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



    @Override
    public String execute() throws Exception {

        if(studentsService==null){
            return ERROR;
        }
        studentsService.insertStudents();

        return SUCCESS;
    }
}
