package cn.earlymorning.netvideo.dao;

import cn.earlymorning.netvideo.beans.RoundDiagram;

import java.util.List;

public interface RoundDiagramMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_round_diagram
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer roundId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_round_diagram
     *
     * @mbg.generated
     */
    int insert(RoundDiagram record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_round_diagram
     *
     * @mbg.generated
     */
    int insertSelective(RoundDiagram record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_round_diagram
     *
     * @mbg.generated
     */
    RoundDiagram selectByPrimaryKey(Integer roundId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_round_diagram
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RoundDiagram record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_round_diagram
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RoundDiagram record);

    List<RoundDiagram> getAlls();
}