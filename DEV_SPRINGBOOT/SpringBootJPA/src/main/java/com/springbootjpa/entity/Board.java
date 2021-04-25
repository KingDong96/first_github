package com.springbootjpa.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="tbl_boards")//원래는 클래스이름따라가는거 같음 일부러 바꿈
public class Board {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long bno;
  private String title;
  private String writer;
  private String content;

  @CreationTimestamp  // javax.persistence가 아닌 ogr.hibernate로 시작하는 패키지에 있는 것을 활용 바랍니다.
  private Timestamp regdate;   // 게시물 작성 시간
  @UpdateTimestamp   // javax.persistence가 아닌 ogr.hibernate로 시작하는 패키지에 있는 것을 활용 바랍니다.
  private Timestamp updatedate;   // 게시물 최종 수정 시간

  // 앞서 @CreationTimestamp와 @UpdateTimestamp는 javax.persistence가 아닌
  //  ogr.hibernate로 시작하는 패키지에 있는 것을 활용하며, 이것은 Hibernate의 고유한 기능으로,
  // Entity가 생성되거나 업데이트 되는 시점의 날짜 데이터를 기록하는 설정입니다.
  
}