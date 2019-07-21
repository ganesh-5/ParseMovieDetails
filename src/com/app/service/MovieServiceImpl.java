package com.app.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.app.bean.Category;
import com.app.bean.MovieCast;

public class MovieServiceImpl implements MovieService{
	
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
	@Override
	public MovieCast[] initializeMovieData() {
		
		BufferedReader inp_data = null;
		try {
			inp_data = new BufferedReader(new FileReader( new File("/Users/ganesh/Desktop/Files/MovieDetails.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String str = null;
		MovieCast[] mv = new MovieCast[10];
		int counter =0;
		try {
			while ((str = inp_data.readLine()) != null) {
			  String[]  cast_arr =str.split(",");
			  System.out.println("before length");
			  if(cast_arr.length >0) {
			  for(int i=0; i<cast_arr.length; i++) {
			   try {
				mv[counter++] = new MovieCast(Integer.parseInt(cast_arr[0]),Category.valueOf(cast_arr[1]), cast_arr[2], cast_arr[3], cast_arr[4], sdf.parse(cast_arr[5]));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  }
			 System.out.println(mv);
			for(MovieCast m:mv) {
				System.out.println(m.getmovie_id()+ " "+m.getmovie_name()+" "+m.getactors()+" "+m.getdirector()+" "+m.getrelease_year() );
			}
			
			  }
			 }
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	return mv;
	}

}
