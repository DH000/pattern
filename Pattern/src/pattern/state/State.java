package pattern.state;

/**
 * 
 * @ClassName: State 
 * @Description: 状态
 * @author:	xuelin
 * @date: Jul 25, 2015 11:07:40 AM 
 *
 */
public interface State {
	
	/**
	 * 
	 * @Title: insertQuarter 
	 * @Description: 放入15分钱
	 * @param:     
	 * @return: void    
	 * @throws 
	 */
	public void insertQuarter();
	
	/**
	 * 
	 * @Title: ejectQuarter 
	 * @Description: 退回15分钱
	 * @param:     
	 * @return: void    
	 * @throws 
	 */
	public void ejectQuarter();
	
	/**
	 * 
	 * @Title: turnCrank 
	 * @Description: 转动曲柄
	 * @param:     
	 * @return: void    
	 * @throws 
	 */
	public void turnCrank();
	
	/**
	 * 
	 * @Title: dispense 
	 * @Description: 分配
	 * @param:     
	 * @return: void    
	 * @throws 
	 */
	public void dispense();
}
