package com.capgemini.university.dao;

public interface QueryMapper {
	public static String Check_login_query="select * from Users where login_id=? and password=?";
	public static String insert_program="insert into Programs_Offered values (?,?,?,?,?)";
	public static String insert_schedule="insert into Programs_Scheduled values (?,?,?,?,?,?)";
	public static String view_Programs_Offered="select * from Programs_Offered";
	public static String view_schedule="select * from Programs_Scheduled";
	public static String delete_Program="delete from Programs_Offered where ProgramName=?";
	public static String delete_Schedule="delete from Programs_Scheduled where SCHEDULED_PROGRAM_ID=?";
}
