package com.kaige123.daomu.eureka_client_video_user.DAO.Mapper;

import com.kaige123.daomu.eureka_client_video_user.DAO.Bean.Drawmony;
import com.kaige123.daomu.eureka_client_video_user.DAO.Bean.DrawmonyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrawmonyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drawmony
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    long countByExample(DrawmonyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drawmony
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int deleteByExample(DrawmonyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drawmony
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int deleteByPrimaryKey(Long dmid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drawmony
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int insert(Drawmony record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drawmony
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int insertSelective(Drawmony record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drawmony
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    List<Drawmony> selectByExample(DrawmonyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drawmony
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    Drawmony selectByPrimaryKey(Long dmid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drawmony
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByExampleSelective(@Param("record") Drawmony record, @Param("example") DrawmonyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drawmony
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByExample(@Param("record") Drawmony record, @Param("example") DrawmonyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drawmony
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByPrimaryKeySelective(Drawmony record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drawmony
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByPrimaryKey(Drawmony record);
}