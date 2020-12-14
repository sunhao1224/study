package com.radiance.gupao.p6.pattern.builder.simple;

import lombok.Data;

/**
 * @author sunhao
 * @date 2020/11/7 14:40
 * @Description:
 */
public class CourseBuilder {
    private Course course = new Course();

    @Data
    public class Course {
        private String name;
        private String ppt;
        private String video;
        private String note;
        private String homework;

        @Override
        public String toString() {
            return "Course{" +
                    "name='" + name + '\'' +
                    ", ppt='" + ppt + '\'' +
                    ", video='" + video + '\'' +
                    ", note='" + note + '\'' +
                    ", homework='" + homework + '\'' +
                    '}';
        }
    }

    public CourseBuilder addName(String name) {
        course.setName(name);
        return this;
    }

    public CourseBuilder addPPT(String ppt) {
        course.setPpt(ppt);
        return this;
    }

    public CourseBuilder addVideo(String video) {
        course.setVideo(video);
        return this;
    }

    public CourseBuilder addNote(String note) {
        course.setNote(note);
        return this;
    }

    public CourseBuilder addHomework(String homework) {
        course.setHomework(homework);
        return this;
    }

    public Course build() {
        return this.course;
    }

}
