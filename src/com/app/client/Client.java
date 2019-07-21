package com.app.client;

import com.app.bean.MovieCast;
import com.app.service.MovieService;
import com.app.service.MovieServiceImpl;

public class Client {
	
	

	public static void main(String[] args)    {
		
		MovieService Service = new MovieServiceImpl();

	     MovieCast[] arr= 	 Service.initializeMovieData();
		
		
		
//			  BufferedReader in = new BufferedReader(new FileReader( new File("/Users/ganesh/Desktop/Files/MovieDetails.txt")));	  
//			  String str;
//			  while ((str = in.readLine()) != null) {
//			     String[] cast_arr =str.split(",");
//			     for(int i=0; i<cast_arr.length;i++) {
//			    	 System.out.println(cast_arr[i]);
//			     }
			  
			//  }
}
}