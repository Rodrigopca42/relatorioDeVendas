import icon from '../../assets/img/notification_icon.svg';
import './style.css';

function NotificationButton() {
    return (
        <div className="dsmeta-red-btn">
            <img src={icon} alt="Notificar" />
        </div> 
    )
  }
  
  export default NotificationButton;
  