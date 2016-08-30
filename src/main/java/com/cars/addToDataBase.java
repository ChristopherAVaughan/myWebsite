package com.cars;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.WeekFiveDayOneHWRedux.CarListFields;
import com.WeekFiveDayOneHWRedux.DAOWeekFourHW;


/**
 * Servlet implementation class addToDataBase
 */
@WebServlet("/addToDataBase")
public class addToDataBase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addToDataBase() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		CarListFields addToDataBase = new CarListFields();
		Integer numOfCyl = Integer.parseInt(request.getParameter("Num of Cylinders"));
		Integer year = Integer.parseInt(request.getParameter("Year"));
		Integer hP = Integer.parseInt(request.getParameter("Horsepower"));
	    Double engDis = Double.parseDouble(request.getParameter("Eng Displacement"));
	        
	    addToDataBase.setCarMake(request.getParameter("Make"));
	    addToDataBase.setCarModel(request.getParameter("Model"));
	    addToDataBase.setYear(year);
	    addToDataBase.setHorsePower(hP);
	    addToDataBase.setNumOfCylinders(numOfCyl);
	    addToDataBase.setEngDisplacement(engDis);
	        
	    DAOWeekFourHW.addToDB(addToDataBase);
	    

	
	}

	
}
