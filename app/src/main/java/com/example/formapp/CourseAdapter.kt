import android.view.LayoutInflater
import com.example.formapp.R

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.formapp.course

class CourseAdapter(var courselist:List<course>) :RecyclerView.Adapter<CourseViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_course,parent,false)
        return CourseViewHolder(itemView)

    }


    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        var currentCourse=courselist.get(position)
        holder.tvCoursename.text =currentCourse.courseName
        holder.tvDescription.text=currentCourse.description
        holder.tvCourseCode. text=currentCourse.courseCode
        holder.tvInstructor. text=currentCourse.instructor

    }

    override fun getItemCount(): Int {
        return courselist.size
    }
}
class CourseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvCoursename=itemView.findViewById<TextView>(R.id.tvCourseName)
    var tvCourseCode=itemView.findViewById<TextView>(R.id.tvCourseCode)
    var tvInstructor=itemView.findViewById<TextView>(R.id.tvCourseTrainer)
    var tvDescription=itemView.findViewById<TextView>(R.id.tvDescription)

}





