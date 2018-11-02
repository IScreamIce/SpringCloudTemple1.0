package com.kaige123.daomu.eureka_client_video_user.DAO.Mapper;

import com.kaige123.daomu.eureka_client_video_user.DAO.Bean.Video;
import com.kaige123.daomu.eureka_client_video_user.DAO.Bean.VideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    long countByExample(VideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int deleteByExample(VideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int deleteByPrimaryKey(Long vid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int insert(Video record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int insertSelective(Video record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    List<Video> selectByExample(VideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    Video selectByPrimaryKey(Long vid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByPrimaryKeySelective(Video record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByPrimaryKey(Video record);
}