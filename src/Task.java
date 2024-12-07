import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "TaskTracker")
public class Task {
    private String jobId;
    private String completedBy;
    private Integer yearCompleted;
    private Integer hoursTaken;
    private String status;

    @DynamoDBHashKey
    public String getJobId() {
        return jobId;
    }


    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @DynamoDBAttribute
    public String getCompletedBy() {
        return completedBy;
    }


    public void setCompletedBy(String completedBy) {
        this.completedBy = completedBy;
    }

    @DynamoDBAttribute
    public Integer getYearCompleted() {
        return yearCompleted;
    }

    @DynamoDBAttribute
    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public void setYearCompleted(Integer yearCompleted) {
        this.yearCompleted = yearCompleted;
    }

    @DynamoDBAttribute
    public Integer getHoursTaken() {
        return hoursTaken;
    }


    public void setHoursTaken(Integer hoursTaken) {
        this.hoursTaken = hoursTaken;
    }
}
