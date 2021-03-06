package cn.sinjinsong.eshop.dao.news;

import cn.sinjinsong.eshop.common.domain.entity.news.NewsDO;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NewsDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated
     */
    int insert(NewsDO record);

    

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated
     */
    NewsDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(NewsDO record);

    Page<NewsDO> findAll(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
    List<NewsDO> findLatest(@Param("count") Integer count);
}