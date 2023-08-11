# stompPractice

프로젝트 실행을 위한 단계입니다 안되는거 궁금한거 있으면
깃헙에서 이슈 열어서 말해주시고
아래 단계를 따라가기 힘들다면 말해주시면 도커파일 만들겠습니다
아니면 디스코드 화면공유해서 도와드릴게요

래빗MQ 설치 및 실행한 후 백엔드 서버 실행해주세요

1. RabbitMQ 설치 및 실행 
RabbitMQ(메시지 브로커) 설치
인터넷에서 나온대로 그냥 설치해주시면 됩니다~~
\
<img width="419" alt="image" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/22155728-f20f-4e0a-a5a4-e94b11d596d1">
\
맥 homebrew로 설치시 아래 링크 참고
\
[RabbitMQ installation - homebrew](https://www.rabbitmq.com/install-homebrew.html)
\
설치하고 나면 아래와 같이 실행해줍니다
\
<img width="502" alt="image" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/c1ead8ef-00fb-46a5-bd0d-05a2e7fabc2b">
\

3. 인텔리J에서 프로젝트 실행
   2.1 프로젝트 열기
   인텔리제이에서 프로젝트 열려면 클론받은 폴더로 가서
   \
   <img width="368" alt="image" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/94f55839-c4c4-4d7c-98cd-738b8de560a9">
   \
   이렇게 demo폴더 선택해서 열어주세요
   \
   <img width="487" alt="image" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/fdb856d7-f07c-4283-aa31-9f7bb06a171f">
   \
   2.2 프로젝트 관련 설정 및 실행
   DemoApplication.java라는 파일 클릭해주면
   \
   <img width="942" alt="image" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/34ced969-9d9a-45b9-b46a-90dee1773a51">
   \
   Module JDK is not defined라고 뜹니다.
   \
      <img width="839" alt="image" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/100200d2-0daa-43c8-8f2a-72cfef89bcfe">
   \
   옆에 Set up JDK를 클릭하여 SDK17(=JDK17) 선택해주세요
   \


!!! SDK17(JDK17)없는 경우 
<img width="647" alt="image" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/78062ca3-f4cf-4bda-b9ef-29b10e0b96b1">
\
<img width="520" alt="image" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/789a512e-5004-4973-8fa6-0bdd567c8781">
\
<img width="523" alt="image" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/deee0f70-c86e-43ca-8509-102bb5414ac9">
\
위와 같이 설치!




   \
   이제 project structure 설정을 위해 아래처럼 들어가서 
   \
   <img width="404" alt="project structure 설정하기" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/c33a0108-87b4-48d3-8b14-53ded047d399">
   \
   <img width="806" alt="project structure 설정하기2" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/43880155-0e2e-4789-861f-0d893c4cd955">
   \
   위 처럼 설정되어있는지(SDK17) 확인
   \
   그리고 이제 settings 들어가서
   \
   <img width="251" alt="settings 설정하기2" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/b0f54ec6-bb26-4ca4-b6c3-147d13fac5b9">
   \
   <img width="982" alt="settings 설정하기" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/94c62a97-2433-4289-8267-d7b63f3941fb">
   \
   위 처럼 설정되어있는지(SDK17) 확인
   \
   <img width="712" alt="image" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/063acefa-4308-43e4-aec3-2c9e18bf600d">
   \
   프로젝트 SDK 설정 되고나서 콘솔에 뭐 이것저것 써지는거 멈춰지고 나면 아래처럼 DemoApplication이 초록색 화살표 옆에 뜨는게 정상입니다!
   안뜨면 그래들 클릭해서
   \
   <img width="135" alt="image" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/21dbf569-468b-4c51-abcc-d644c1c65f71">
   \
   이 버튼 하나 눌러주세요
   \
   초록색 화살표 클릭해서 백엔드 서버 실행하세요
   \
   <img width="668" alt="Screenshot 2023-08-11 at 11 30 57 AM" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/9efa93b5-df19-445b-a8d1-1e390a3c0c14">
   \
   복잡하다고 느끼실 수 있지만 한번만 설정해두면 나중엔 초록석 화살표만 누르면 됩니다.
   \
   그리고 프론트는 .. 잘 알고 계실테니 생략!!!
   \

5. 실행시 예시
6. \
   <img width="254" alt="예시1" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/c60105ae-a1c8-4fc8-8066-309fa22670e1">
   \
   이미 만들어진 채팅창 다른 브라우저에서 접속해보기
   \
   <img width="261" alt="예시2" src="https://github.com/ecofriendlyusername/stompPractice/assets/46067895/1735fb2b-fc26-407b-9a6e-fdacbd0aeec9">
   \
   다른 브라우저에서 접속한 유저가 채팅하는 것을 확인 가능

   
