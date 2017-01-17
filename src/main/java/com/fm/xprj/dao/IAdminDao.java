package com.fm.xprj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.fm.xprj.model.Match;
import com.fm.xprj.model.User;

@Repository
public interface IAdminDao {
	
	public static final String createMatch="insert into matchs (match_type,match_date,match_location) values(#{match.matchType},#{match.matchDate},#{match.matchLocation})";
	public static final String getMatchById="select * from matchs where id = #{id}";
	public static final String getMatchByPage="select * from matchs LIMIT #{pn},#{ps}";
	public static final String getUserByLoginId="select * from user where username = #{id}";
	public static final String deleteUserById="delete from user where id=#{id}";
	public static final String updateUser="update user set username=#{user.loginId},password=#{user.loginPwd},nickname=#{user.nickName},birthday=#{user.birthDate} ,email=#{user.email},telphone=#{user.phoneNumber},team_position=#{user.teamPosition},height=#{user.height},weight=#{user.weight},ranking=#{user.ranking},icon_url=#{user.iconUrl} where id=#{user.id}";
	public static final String getAllUsers="select * from user";
	public static final String reserveMatch="insert into booking_match (user_id,match_id) values(#{userId},#{matchId})";
	public static final String login="select * from user where username=#{loginId} and password=#{loginPwd}";
	public static final String cancelReservedMatch="delete from booking_match where user_id=#{userId} and match_id=#{matchId}";
	public static final String getAllMatches="select * from matchs";
	
	@Insert(createMatch)
	@Options(useGeneratedKeys=true, keyProperty="match.id" ,keyColumn="id")
	public void createMatch(@Param("match")Match match);
	
	@Select(getMatchById)   
	@Results({
		@Result(property="id",column="id"),
		@Result(property="matchType",column="match_type"),
		@Result(property="matchDate",column="match_date"),
		@Result(property="matchLocation",column="match_location"),
		@Result(property="isBooked",column="isBooked")
		
	})
	public Match getMatchById(@Param("id")int id);
	
	@Select(getMatchByPage)   
	@Results({
		@Result(property="id",column="id"),
		@Result(property="matchType",column="match_type"),
		@Result(property="matchDate",column="match_date"),
		@Result(property="matchLocation",column="match_location"),
		@Result(property="isBooked",column="isBooked")
		
	})
	public List<Match> getMatchByPage(@Param("ps")int pageSize, @Param("pn")int pageNow);
	
	
	@Select(getUserByLoginId)
	@Results({
		@Result(property="id",column="id"),
		@Result(property="loginId",column="username"),
		@Result(property="loginPwd",column="password"),
		@Result(property="nickName",column="nickname"),
		@Result(property="birthDate",column="birthday"),
		@Result(property="email",column="email"),
		@Result(property="phoneNumber",column="telphone"),
		@Result(property="teamPosition",column="team_position"),
		@Result(property="height",column="height"),
		@Result(property="weight",column="weight"),
		@Result(property="ranking",column="ranking"),
		@Result(property="iconUrl",column="icon_url")
		
	})
	public User getUserByLoginId(@Param("id")String loginId);
	@Delete(deleteUserById)
	public void deleteUserById(@Param("id")int id);
	@Update(updateUser)
	public void updateUser(@Param("user")User user);
	@Select(getAllUsers)
	@Results({
		@Result(property="id",column="id"),
		@Result(property="loginId",column="username"),
		@Result(property="loginPwd",column="password"),
		@Result(property="nickName",column="nickname"),
		@Result(property="birthDate",column="birthday"),
		@Result(property="email",column="email"),
		@Result(property="phoneNumber",column="telphone"),
		@Result(property="teamPosition",column="team_position"),
		@Result(property="height",column="height"),
		@Result(property="weight",column="weight"),
		@Result(property="ranking",column="ranking"),
		@Result(property="iconUrl",column="icon_url")
		
	})
	public List<User> getAllUsers();
	@Insert(reserveMatch)
	@Options(useGeneratedKeys=true)
	public void reserveMatch(@Param("userId")int userId,@Param("matchId")int matchId);
	@Delete(cancelReservedMatch)
	public void cancelReservedMatch(@Param("userId")int userId,@Param("matchId")int matchId);
	@Select(getAllMatches)
	@Results({
		@Result(property="id",column="id"),
		@Result(property="matchType",column="match_type"),
		@Result(property="matchDate",column="match_date"),
		@Result(property="matchLocation",column="match_location"),
		@Result(property="isBooked",column="isBooked")
	})
	public List<Match> getAllMatches();
	
	
	@Select(login)
	@Results({
		@Result(property="id",column="id"),
		@Result(property="loginId",column="username"),
		@Result(property="loginPwd",column="password"),
		@Result(property="nickName",column="nickname"),
		@Result(property="birthDate",column="birthday"),
		@Result(property="email",column="email"),
		@Result(property="phoneNumber",column="telphone"),
		@Result(property="teamPosition",column="team_position"),
		@Result(property="height",column="height"),
		@Result(property="weight",column="weight"),
		@Result(property="ranking",column="ranking"),
		@Result(property="iconUrl",column="icon_url")
		
	})
	public User login(@Param("loginId")String loginId,@Param("loginPwd")String loginPwd);
	

}
