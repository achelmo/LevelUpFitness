package edu.uwrf.csis343;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class WorkoutListAdapter extends BaseAdapter {

    private Context context;
    private List<Workout> workoutList;

    public WorkoutListAdapter(Context context, List<Workout> workoutList) {
        this.context = context;
        this.workoutList = workoutList;

    }


    @Override
    public int getCount() {
        return workoutList.size();
    }

    @Override
    public Object getItem(int position) {
        return workoutList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.workout_list_row, null);

            viewHolder = new ViewHolder();

            viewHolder.textViewName = convertView.findViewById(R.id.textViewName);
            viewHolder.textViewExercise1 = convertView.findViewById(R.id.textViewExercise1);
            viewHolder.textViewExercise2 = convertView.findViewById(R.id.textViewExercise2);
            viewHolder.textViewExercise3 = convertView.findViewById(R.id.textViewExercise3);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)convertView.getTag();
        }
        Workout workout = workoutList.get(position);

        viewHolder.textViewName.setText(workout.getName());

        viewHolder.textViewExercise1.setText(workout.getExerciseList().get(0).getName());
        viewHolder.textViewExercise2.setText(workout.getExerciseList().get(1).getName());
        viewHolder.textViewExercise3.setText(workout.getExerciseList().get(2).getName());

        return convertView;
    }

    private Drawable getImageDrawable(String imageName){
        int id  = context.getResources().getIdentifier(imageName, "drawable",
                context.getPackageName());
        return context.getResources().getDrawable(id);
    }

    class ViewHolder{
        TextView textViewName;
        TextView textViewExercise1;
        TextView textViewExercise2;
        TextView textViewExercise3;
    }

}
