package pers.gulo.fm.dao;

import java.util.List;

import pers.gulo.fm.domain.AirPlane;
import pers.gulo.fm.domain.Flight;
import pers.gulo.fm.domain.Order;
import pers.gulo.fm.domain.Statistic;
import pers.gulo.fm.domain.User;
import pers.gulo.fm.exception.FMException;

public interface AdminDao {
	
	/**
	 * 查询所有演出团队
	 * @return
	 */
	public List<AirPlane> queryAllAirPlane();
	/**
	 * 添加新的演出团队
	 * @param airPlane
	 */
	public void insertAirPlane(AirPlane airPlane) throws FMException;
	
	/**
	 * 删除一个演出团队
	 * @param airPlane
	 */
	public void deleteAirPlane(AirPlane airPlane) throws FMException;
	
	/**
	 * 添加新的演出
	 * @param flight
	 */
	public void insertFlight(Flight flight) throws FMException;

	/**
	 * 修改演出信息
	 * @param flight
	 */
	public void updateFlight(Flight flight) throws FMException;
	
	/**
	 * 查询所有用户信息
	 * @return
	 */
	public List<User> queryUsers();

	/**
	 * 删除一条演出
	 * @param flight
	 */
	public void deleteFlight(Flight flight) throws FMException;

	/**
	 * 查询所有演出信息
	 * @return
	 */
	public List<Flight> queryAllFlight();
	
	public void deleteUser(User user) throws FMException;
	
	public void updateUser(User user) throws FMException;
	
	public List<Order> queryAllOrder();
	
	public Statistic makeStatistic();
	
	public Statistic makeStatistic(String start);
	
	
}
